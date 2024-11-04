package mysql;

import model.AnimeCharacter;
import model.CharacterTeam;
import util.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HandleDB {
    private static Connection con = DatabaseConnection.getConnection();

    public List<AnimeCharacter> getTeamMembersBYName(String nombreequipo){
        String sql = "SELECT * FROM anime_character AS ac " +
                "JOIN character_team AS ct ON ac.id = ct.character_id " +
                "JOIN anime_team AS at ON at.id = ct.team_id " +
                "WHERE at.team_name = ?";
        List<AnimeCharacter> personajes = new ArrayList<>();
        try (PreparedStatement ps = con.prepareStatement(sql)){
            ps.setString(1,nombreequipo);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                AnimeCharacter character = new AnimeCharacter();
                character.setId(rs.getInt(1));
                character.setName(rs.getString(2));
                character.setSpecialPower(rs.getString(3));
                character.setPopularityLevel(rs.getInt(4));
                character.setSpecialPower(rs.getString(5));
                personajes.add(character);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return personajes;
    }
    public void updateAnimeTeamMembers(String equipo, List<CharacterTeam> personajeNuevos, List<CharacterTeam> personajesBorrados){
        String delete = "DELETE FROM character_team WHERE character_id = ?";
        String insert = "INSERT INTO character_team (team_id,character_id,role_in_team,years_in_team) VAlUES(?,?,?,?) ";
        try (PreparedStatement ps = con.prepareStatement(delete)){
            for (CharacterTeam pero : personajesBorrados) {
                ps.setInt(1,pero.getCharacterId());
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try (PreparedStatement ps1 = con.prepareStatement(insert)){
            for (CharacterTeam pero1 : personajeNuevos) {
                ps1.setInt(1,pero1.getTeamId());
                ps1.setInt(2,pero1.getCharacterId());
                ps1.setString(3,pero1.getRoleInteam());
                ps1.setInt(4,pero1.getYearsInTeam());
            }

            } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
